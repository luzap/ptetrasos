package com.bt.ptetrasos.components.game;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.Animation;

/**
 * Created by Titas on 2016-07-21.
 */
public class Anim extends Component {

    private String animationReference;

    private int Layer;

    private Animation animation = null;
    private Boolean framesGoForward = true;
    private Boolean animationRepeating = false;
    private int currentFrame = 0;
    private float maxFrameTime;
    private Boolean isStopped = false;
    private int age;


    public int getAge() {
        return age;
    }

    public void addAge(float deltaAge) {
        this.age += deltaAge;
    }

    public String getAnimationReference() {
        return animationReference;
    }

    public void setAnimationReference(String animationReference) {
        this.animationReference = animationReference;
    }

    public float getMaxFrameTime() {
        return maxFrameTime;
    }

    public void setMaxFrameTime(float maxFrameTime) {
        this.maxFrameTime = maxFrameTime;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public void changeCurrentFrame(int delta) {
        currentFrame += delta;
    }


    public Boolean isStopped() {
        return isStopped;
    }

    public void setStopped(Boolean stopped) {
        isStopped = stopped;
    }


    public int getLayer() {
        return Layer;
    }

    public void setLayer(int layer) {
        Layer = layer;
    }

    public Anim(String animRef, int layer) {
        this.animationReference = animRef;
        setLayer(layer);
    }


    public Boolean getAnimationRepeating() {
        return animationRepeating;
    }



    public Boolean getForward() {
        return framesGoForward;
    }

    public void setForward(Boolean framesGoForward) {
        this.framesGoForward = framesGoForward;
    }

    public float getEllapsedTime() {
        return ellapsedTime;
    }


    public void setEllapsedTime(float ellapsedTime) {
        this.ellapsedTime = ellapsedTime;
    }

    private float ellapsedTime = 0;

    public Animation getAnimation() {
        return animation;
    }


    public void addEllapsedTime(float time){
        ellapsedTime += time;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }








}
