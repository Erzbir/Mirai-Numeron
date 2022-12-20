package boot.help;

import boot.processor.CommandAnnotationProcessor;
import com.erzbir.mirai.numeron.enums.PermissionType;
import com.erzbir.mirai.numeron.listener.Listener;
import com.erzbir.mirai.numeron.listener.massage.Message;
import net.mamoe.mirai.event.events.MessageEvent;

/**
 * @author Erzbir
 * @Date: 2022/12/1 21:27
 */
@Listener
@SuppressWarnings("unused")
public class Help {
    @Message(text = "/boot/help", permission = PermissionType.ALL)
    private void help(MessageEvent event) {
        event.getSubject().sendMessage(CommandAnnotationProcessor.stringBuilder.toString());
    }
}