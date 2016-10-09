package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Instrument;
import com.txc.springInAction.chap2.service.Poem;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiaocantan on 2016/10/8.
 */
@Setter
public class PoeticJuggler extends Juggler {
    private Poem poem;
    private Instrument instrument;
    public PoeticJuggler(){
        super(33);
    }
    public PoeticJuggler(Poem poem){
        super(25);
        this.poem = poem;
    }
//    public PoeticJuggler(int beanBags,Poem poem) {
//        super(beanBags);
//        this.poem = poem;
//    }
    public PoeticJuggler(Poem poem,Instrument instrument) {
        super(25);
        this.poem = poem;
        this.instrument = instrument;
    }
//    public PoeticJuggler(int beanBags){
//        super(beanBags);
//    }
    @Override
    public void perform(){
        super.perform();
        if(poem != null)
            poem.recite();
        if(instrument != null)
            instrument.play();
    }
}
