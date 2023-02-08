package client.commands;

import client.TcpClient;

abstract class Command {
    //Client sends POST(show data) to TcpServer
    protected TcpClient sender;
    
    public Command(TcpClient sender){
        this.sender = sender;
    }

    public abstract void execute();
}
