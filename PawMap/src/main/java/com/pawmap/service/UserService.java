package com.pawmap.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.pawmap.VO.UserVO;

@Component
public interface UserService {
	
	void insertUser(UserVO vo);
	//병원 회원 가입
	void insertHospitalUser(UserVO vo);
	
	//제휴 병원 hospital_data 테이블에 삽입
	void insertHospitalData(UserVO vo);
	
	UserVO findByUsername(String username);
	

	void socialJoin(UserVO vo);

	// 아이디 중복 검사
	public int idCheck(String id) throws Exception;
	
	// 닉네임 중복 검사
	public int nickCheck(String nickname) throws Exception;
	
	// 이메일 중복 검사
	public int emailCheck(String email) throws Exception;

	// 사업자등록번호 중복 검사
	public int comCheck(String comnum) throws Exception;	
	
	public UserVO checkDuplicateId(@Param("userId") int userId);
	

	public Map<String, Object> login(Map<String, Object> args);

	public Map<String, Object> loginV2(Map<String, Object> args);
	
	String searchId(@Param("userName")String userName, @Param("userTelNum")String userTelNum);


	public Map<String, Object> findLoginPasswd(Map<String, Object> param);



	//회원정보 수정 메서드
	public void updateUser(UserVO vo);
	
	//회원정보 삭제 메서드
	public void deleteUser(UserVO vo);

	//일반 유저 리스트 가져오는 메서드
	public List<UserVO> getUserList(UserVO vo);
	//병원 유저 리스트 가져오는 메서드
	public List<UserVO> getHospitalUserList(UserVO vo);
	
	//특정 유저 정보 가져오는 메서드
	public UserVO getUser(UserVO vo);
	
	//관리자 페이지 수정 메서드
	public void updateUserAdmin(UserVO vo);
	

	//프로필 사진 삭제시 user필드의 user_profile 컬럼을 null로 세팅
	void updateUserProfileNull(int userSeq, String userType, String userId);


}
