package client.commands;

import client.TcpClient;

public class PostCommand extends Command{
    private String message;
    public PostCommand(TcpClient sender, String message) {
        super(sender);
        this.message = message;
    }

    @Override
    public void execute() {
        sender.post(message);
    }
    
}
