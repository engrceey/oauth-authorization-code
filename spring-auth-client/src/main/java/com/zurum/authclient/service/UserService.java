package com.zurum.authclient.service;


import com.zurum.authclient.dto.UserRequestDto;
import com.zurum.authclient.entity.User;
import com.zurum.authclient.entity.VerificationToken;

import java.util.Optional;

public interface UserService {
    User registerUser(UserRequestDto userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
