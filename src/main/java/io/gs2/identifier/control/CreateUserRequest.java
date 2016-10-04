package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * ユーザの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateUserRequest extends Gs2BasicRequest<CreateUserRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "CreateUser";
	}
	
	/** ユーザ名 */
	String name;
	
	/**
	 * ユーザ名を取得。
	 * 
	 * @return ユーザ名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ユーザ名を設定。
	 * 
	 * @param name ユーザ名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ユーザ名を設定。
	 * 
	 * @param name ユーザ名
	 * @return this
	 */
	public CreateUserRequest withName(String name) {
		setName(name);
		return this;
	}
}
