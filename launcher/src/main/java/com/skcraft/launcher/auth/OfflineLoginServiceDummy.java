package com.skcraft.launcher.auth;

import com.skcraft.launcher.util.HttpRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.net.URL;

@RequiredArgsConstructor
public class OfflineLoginServiceDummy implements LoginService {

    @Override
    public Session restore(SavedSession savedSession) throws IOException, InterruptedException, AuthenticationException {
        return new OfflineSession(savedSession.getUsername());
    }
}
