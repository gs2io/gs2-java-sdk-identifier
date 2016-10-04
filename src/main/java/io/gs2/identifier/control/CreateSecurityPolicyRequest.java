package io.gs2.identifier.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.identifier.Gs2Identifier;

/**
 * セキュリティポリシーの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateSecurityPolicyRequest extends Gs2BasicRequest<CreateSecurityPolicyRequest> {

	public static class Constant extends Gs2Identifier.Constant {
		public static final String FUNCTION = "CreateSecurityPolicy";
	}
	
	/** セキュリティポリシー名 */
	String name;
	/** ポリシー */
	String policy;
	
	/**
	 * セキュリティポリシー名を取得。
	 * 
	 * @return セキュリティポリシー名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param name セキュリティポリシー名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * セキュリティポリシー名を設定。
	 * 
	 * @param name セキュリティポリシー名
	 * @return this
	 */
	public CreateSecurityPolicyRequest withName(String name) {
		setName(name);
		return this;
	}
	
	/**
	 * ポリシーを取得。
	 * 
	 * @return ポリシー
	 */
	public String getPolicy() {
		return policy;
	}
	
	/**
	 * ポリシーを設定。
	 * 
	 * @param policy ポリシー
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	
	/**
	 * ポリシーを設定。
	 * 
	 * @param policy ポリシー
	 * @return this
	 */
	public CreateSecurityPolicyRequest withPolicy(String policy) {
		setPolicy(policy);
		return this;
	}
}
