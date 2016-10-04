package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * セキュリティポリシーの取得リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class GetSecurityPolicyRequest extends Gs2BasicRequest<GetSecurityPolicyRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "GetSecurityPolicy";
	}
	
	/** セキュリティポリシー名 */
	String identifierName;
	
	/**
	 * セキュリティポリシー名を取得。
	 * 
	 * @return セキュリティポリシー名
	 */
	public String getSecurityPolicyName() {
		return identifierName;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param identifierName セキュリティポリシー名
	 */
	public void setSecurityPolicyName(String identifierName) {
		this.identifierName = identifierName;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param identifierName セキュリティポリシー名
	 * @return this
	 */
	public GetSecurityPolicyRequest withSecurityPolicyName(String identifierName) {
		setSecurityPolicyName(identifierName);
		return this;
	}
}
