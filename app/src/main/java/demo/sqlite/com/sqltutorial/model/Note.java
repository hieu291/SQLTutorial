package demo.sqlite.com.sqltutorial.model;

import java.io.Serializable;

public class Note implements Serializable {
    private int noteid;

    public Note(int noteid, String noteTitle, String noteContent) {
        this.noteid = noteid;
        this.noteTitle = noteTitle;
        this.noteContent = noteContent;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    private String noteTitle;
    private String noteContent;

    public Note() {
    }

    @Override
    public String toString() {
        return this.noteTitle();
    }

    private String noteTitle() {
        return this.noteTitle;
    }
}
