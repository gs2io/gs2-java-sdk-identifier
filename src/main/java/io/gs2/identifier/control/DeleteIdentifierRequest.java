package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * GSIの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteIdentifierRequest extends Gs2BasicRequest<DeleteIdentifierRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "DeleteIdentifier";
	}

	/** ユーザ名 */
	String userName;
	/** GSI ID */
	String identifierId;

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
	public DeleteIdentifierRequest withUserName(String userName) {
		setUserName(userName);
		return this;
	}
	
	/**
	 * GSI IDを取得。
	 * 
	 * @return GSI ID
	 */
	public String getIdentifierId() {
		return identifierId;
	}
	
	/**
	 * GSI IDを設定。
	 * 
	 * @param identifierId GSI ID
	 */
	public void setIdentifierId(String identifierId) {
		this.identifierId = identifierId;
	}
	
	/**
	 * GSI IDを設定。
	 * 
	 * @param identifierId GSI ID
	 * @return this
	 */
	public DeleteIdentifierRequest withIdentifierId(String identifierId) {
		setIdentifierId(identifierId);
		return this;
	}
}
