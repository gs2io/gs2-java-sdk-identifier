package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * GSIの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DetachSecurityPolicyRequest extends Gs2BasicRequest<DetachSecurityPolicyRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "DetachSecurityPolicy";
	}

	/** ユーザ名 */
	String userName;
	/** セキュリティポリシーID */
	String securityPolicyId;

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
	public DetachSecurityPolicyRequest withUserName(String userName) {
		setUserName(userName);
		return this;
	}
	
	/**
	 * セキュリティポリシーIDを取得。
	 * 
	 * @return セキュリティポリシーID
	 */
	public String getSecurityPolicyId() {
		return securityPolicyId;
	}
	
	/**
	 * セキュリティポリシーIDを設定。
	 * 
	 * @param securityPolicyId セキュリティポリシーID
	 */
	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
	}
	
	/**
	 * セキュリティポリシーIDを設定。
	 * 
	 * @param securityPolicyId セキュリティポリシーID
	 * @return this
	 */
	public DetachSecurityPolicyRequest withSecurityPolicyId(String securityPolicyId) {
		setSecurityPolicyId(securityPolicyId);
		return this;
	}
}
