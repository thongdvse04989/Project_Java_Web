/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author quach
 */
public class FrameLeftImage {

    private int id;
    private String linkimage;

    public FrameLeftImage() {
    }

    public FrameLeftImage(int id, String linkimage) {
        this.id = id;
        this.linkimage = linkimage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkimage() {
        return linkimage;
    }

    public void setLinkimage(String linkimage) {
        this.linkimage = linkimage;
    }

    
}
