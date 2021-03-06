package com.se325.common;

import org.hibernate.annotations.Entity;

// default package
// Generated 19/09/2013 3:18:21 AM by Hibernate Tools 4.0.0

/**
 * Replay generated by hbm2java
 */

@Entity
public class Replay implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private int matchId;
    private String replayPath;
    private long uploader;

    public Replay() {
    }

    public Replay(int matchId, String replayPath, long uploader) {
        this.matchId = matchId;
        this.replayPath = replayPath;
        this.uploader = uploader;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMatchId() {
        return this.matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getReplayPath() {
        return this.replayPath;
    }

    public void setReplayPath(String replayPath) {
        this.replayPath = replayPath;
    }

    public long getUploader() {
        return this.uploader;
    }

    public void setUploader(long uploader) {
        this.uploader = uploader;
    }

}
