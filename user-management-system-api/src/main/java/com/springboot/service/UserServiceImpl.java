package com.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.springboot.entity.UserEntity;
import com.springboot.model.User;
import com.springboot.repository.UserRespository;


@Service
public class UserServiceImpl implements UserService {

	private UserRespository userRepository;
	
	public UserServiceImpl(UserRespository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userRepository.save(userEntity);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<UserEntity> userEntities = userRepository.findAll();
		List<User> users = userEntities.
				stream()
				.map(userEntity -> new User(
						userEntity.getId(),
						userEntity.getFirstName(),
						userEntity.getLastName(),
						userEntity.getEmailId()
						)).collect(Collectors.toList());
		return users;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userRepository.findById(id).get();
		User user = new User();
		BeanUtils.copyProperties(userEntity, user);
		return user;
		
	}

	@Override
	public boolean deleterUser(Long id) {
		// TODO Auto-generated method stub
		UserEntity user = userRepository.findById(id).get();
		userRepository.delete(user);
		return true;
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userRepository.findById(id).get();
		userEntity.setEmailId(user.getEmailId());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userRepository.save(userEntity);
		return user;
	}

}
