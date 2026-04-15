package com.demo.ecommerce.user.service;

import com.demo.ecommerce.user.dto.response.ProfileReponse;
import com.demo.ecommerce.user.dto.response.UserResponse;
import com.demo.ecommerce.user.entity.Profile;
import com.demo.ecommerce.user.entity.User;
import com.demo.ecommerce.user.repository.ProfileRepository;
import com.demo.ecommerce.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProfileRepository profileRepository;

    public UserResponse findUserById(long id){
        UserResponse userResponse = new UserResponse();
        User user = userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("not exist id"));
        userResponse.setId(user.getId());
        userResponse.setUsername(user.getUsername());
        userResponse.setEmail(user.getEmail());

        Profile profile = user.getProfile();
        if(profile != null){
            ProfileReponse pRes = new ProfileReponse();
            pRes.setId(profile.getId());
            pRes.setFullName(profile.getFullName());
            pRes.setPhone(profile.getPhone());
            pRes.setAddress(profile.getAddress());
            userResponse.setProfile(pRes);
        }
        return userResponse;
    }
}
