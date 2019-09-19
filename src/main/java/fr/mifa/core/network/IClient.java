package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;

import java.io.ObjectOutput;
import java.net.Socket;

public interface IClient {
    ObjectOutput getOutputStream();
    void connect(String address, int port);
    void send(Packet packet);
}
