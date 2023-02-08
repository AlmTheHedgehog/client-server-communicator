package client.commands;

import client.TcpClient;

public class CmdLinePostCommand extends Command{

    public CmdLinePostCommand(TcpClient sender) {
        super(sender);
    }

    @Override
    public void execute() {
        sender.post(sender.gui.textField.getText());
    }
    
}
