/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author 799229
 */
public class Note implements Serializable {

    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String contents) {
        this.content = contents;
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", contents=" + content + '}';
    }

}
