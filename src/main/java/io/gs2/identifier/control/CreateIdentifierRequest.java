package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * GSIの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateIdentifierRequest extends Gs2BasicRequest<CreateIdentifierRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "CreateIdentifier";
	}

	/** ユーザ名 */
	String userName;

	/**
	 * ユーザ名を取得。
	 * 
	 * @return ユーザ名
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * ユーザ名を設定。
	 * 
	 * @param userName ユーザ名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * ユーザ名を設定。
	 * 
	 * @param userName ユーザ名
	 * @return this
	 */
	public CreateIdentifierRequest withUserName(String userName) {
		setUserName(userName);
		return this;
	}
}
