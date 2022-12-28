package com.erzbir.mirai.numeron.entity;

import lombok.Getter;
import lombok.Setter;
import net.mamoe.mirai.Bot;

/**
 * @author Erzbir
 * @Date: 2022/12/28 00:20
 */
@Getter
@Setter
public class NumeronBot {
    public static final NumeronBot INSTANCE = new NumeronBot();
    private long master = 0;
    private boolean open = true;
    private Bot bot;

    private NumeronBot() {

    }

    public void turnOn() {
        setOpen(true);
    }

    public void turnOff() {
        setOpen(false);
    }
}
