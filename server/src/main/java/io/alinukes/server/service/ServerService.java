package io.alinukes.server.service;

import io.alinukes.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String server);
    Collection<Server> list(int Limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
