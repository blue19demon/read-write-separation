package com.rd.sharding.entity;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.account
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.account
     *
     * @return the value of user_info.account
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.account
     *
     * @param account the value for user_info.account
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbg.generated Tue Mar 13 23:47:19 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", account=" + account + ", password="
				+ password + "]";
	}
    
    
}