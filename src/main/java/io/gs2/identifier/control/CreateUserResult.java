package io.gs2.identifier.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.User;

/**
 * ユーザの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateUserResult {
	
	User item;
	
	/**
	 * ユーザを取得。
	 * 
	 * @return ユーザ
	 */
	public User getItem() {
		return item;
	}
	
	/**
	 * ユーザを設定。
	 * 
	 * @param item ユーザ
	 */
	public void setItem(User item) {
		this.item = item;
	}
	
	/**
	 * ユーザを設定。
	 * 
	 * @param item ユーザ
	 * @return this
	 */
	public CreateUserResult withItem(User item) {
		setItem(item);
		return this;
	}
}
