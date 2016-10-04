package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * セキュリティポリシーの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateSecurityPolicyRequest extends Gs2BasicRequest<UpdateSecurityPolicyRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "UpdateSecurityPolicy";
	}

	/** セキュリティポリシー名 */
	String identifierName;
	/** ポリシー */
	String policy;

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
	public UpdateSecurityPolicyRequest withSecurityPolicyName(String identifierName) {
		setSecurityPolicyName(identifierName);
		return this;
	}
	
	/**
	 * サービスクラスを取得。
	 * 
	 * @return サービスクラス
	 */
	public String getPolicy() {
		return policy;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param policy サービスクラス
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
	/**
	 * サービスクラスを設定。
	 * 
	 * @param policy サービスクラス
	 * @return this
	 */
	public UpdateSecurityPolicyRequest withPolicy(String policy) {
		setPolicy(policy);
		return this;
	}
}
