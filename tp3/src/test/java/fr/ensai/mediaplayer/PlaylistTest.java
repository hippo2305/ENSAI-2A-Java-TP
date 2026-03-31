package fr.ensai.mediaplayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PlaylistTest {
    private Song song1;
    private Song song2;
    private Playlist p;

    @BeforeEach
    void givenSetup() {
        song1 = mock(Song.class);
        song2 = mock(Song.class);

        p = new Playlist("Playlist 1");
    }
    
    @Test
    void testGetPlaylistSize() {
        p.addMedia(song1);
        p.addMedia(song2);
        int pSize = p.getPlaylistSize();

        assertEquals(2, pSize);
        assertEquals(1, pSize - 1);

    }
    
    @Test
    void testAddSong() {
        // WHEN
        p.addMedia(song1);
        p.addMedia(song2);

        // THEN
        assertTrue(p instanceof Playlist);
        assertEquals(2, p.getPlaylistSize());
    }

    @Test
    void testRemoveSong() {
        // WHEN
        p.addMedia(song1);
        p.addMedia(song2);
        int pSize = p.getPlaylistSize();

        Playlist p2 = new Playlist(p);
        p2.removeMedia(song2);
        int p2Size = p2.getPlaylistSize();

        // THEN
        assertTrue(p instanceof Playlist);
        assertTrue(p2 instanceof Playlist);

        assertEquals(pSize - 1, p2Size);
    }
}
