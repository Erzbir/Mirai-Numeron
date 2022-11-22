package com.erzbir.mirai.numeron.plugins.qqmanage.action;

import com.erzbir.mirai.numeron.annotation.litener.Listener;
import com.erzbir.mirai.numeron.annotation.massage.Message;
import com.erzbir.mirai.numeron.controller.factory.GroupListActionFactory;
import com.erzbir.mirai.numeron.enums.FilterRule;
import com.erzbir.mirai.numeron.enums.MessageRule;
import com.erzbir.mirai.numeron.enums.PermissionType;
import net.mamoe.mirai.event.events.MessageEvent;

/**
 * @author Erzbir
 * @Date: 2022/11/22 00:57
 */
@Listener
public class GroupAction {
    @Message(text = "/enable group\\s+\\d+", filterRule = FilterRule.NONE, messageRule = MessageRule.REGEX, permission = PermissionType.MASTER)
    public void enable(MessageEvent event) {
        String[] split = event.getMessage().contentToString().split("\\s+");
        long id = Long.parseLong(split[2]);
        GroupListActionFactory.INSTANCE.build().add(id);
        event.getSubject().sendMessage("群: " + id + " 已授权");
    }

    @Message(text = "/disable group\\s+\\d+", filterRule = FilterRule.NONE, messageRule = MessageRule.REGEX, permission = PermissionType.MASTER)
    public void disable(MessageEvent event) {
        String[] split = event.getMessage().contentToString().split("\\s+");
        long id = Long.parseLong(split[2]);
        GroupListActionFactory.INSTANCE.build().remove(id);
        event.getSubject().sendMessage("群: " + id + " 已取消授权");
    }
}