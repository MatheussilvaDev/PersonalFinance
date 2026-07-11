package com.mathdev.personal_finance_api.user;

import com.mathdev.personal_finance_api.exception.InvalidArgumentException;
import com.mathdev.personal_finance_api.user.request.CreateUserRequest;
import com.mathdev.personal_finance_api.user.response.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public CreateUserResponse createUser(CreateUserRequest request){
        if(userExistsByEmail(request.getEmail())){
            throw new InvalidArgumentException("E-mail já cadastrado");
        }

        UserEntity entity = userRepository.save(userMapper.toEntity(request));
        return userMapper.toResponse(entity);
    }

    public boolean userExistsByEmail(String email){
        return userRepository.findByEmail(email).isPresent();
    }

}
