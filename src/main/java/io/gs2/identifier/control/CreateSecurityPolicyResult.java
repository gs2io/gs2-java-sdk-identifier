package io.gs2.identifier.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.SecurityPolicy;

/**
 * セキュリティポリシーの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateSecurityPolicyResult {
	
	SecurityPolicy item;
	
	/**
	 * セキュリティポリシーを取得。
	 * 
	 * @return セキュリティポリシー
	 */
	public SecurityPolicy getItem() {
		return item;
	}
	
	/**
	 * セキュリティポリシーを設定。
	 * 
	 * @param item セキュリティポリシー
	 */
	public void setItem(SecurityPolicy item) {
		this.item = item;
	}
	
	/**
	 * セキュリティポリシーを設定。
	 * 
	 * @param item セキュリティポリシー
	 * @return this
	 */
	public CreateSecurityPolicyResult withItem(SecurityPolicy item) {
		setItem(item);
		return this;
	}
}
