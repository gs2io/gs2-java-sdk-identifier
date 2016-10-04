package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * セキュリティポリシーの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteSecurityPolicyRequest extends Gs2BasicRequest<DeleteSecurityPolicyRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "DeleteSecurityPolicy";
	}
	
	/** セキュリティポリシー名 */
	String securityPolicyName;
	
	/**
	 * セキュリティポリシー名を取得。
	 * 
	 * @return セキュリティポリシー名
	 */
	public String getSecurityPolicyName() {
		return securityPolicyName;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param securityPolicyName セキュリティポリシー名
	 */
	public void setSecurityPolicyName(String securityPolicyName) {
		this.securityPolicyName = securityPolicyName;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param securityPolicyName セキュリティポリシー名
	 * @return this
	 */
	public DeleteSecurityPolicyRequest withSecurityPolicyName(String securityPolicyName) {
		setSecurityPolicyName(securityPolicyName);
		return this;
	}
}
