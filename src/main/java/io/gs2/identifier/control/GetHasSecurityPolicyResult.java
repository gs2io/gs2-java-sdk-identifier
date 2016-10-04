package io.gs2.identifier.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.SecurityPolicy;

/**
 * GSI取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetHasSecurityPolicyResult {

	/** 保持しているセキュリティポリシー */
	List<SecurityPolicy> items;
	
	/**
	 * 保持しているセキュリティポリシーを取得。
	 * 
	 * @return 保持しているセキュリティポリシー
	 */
	public List<SecurityPolicy> getItems() {
		return items;
	}
	
	/**
	 * 保持しているセキュリティポリシーを設定。
	 * 
	 * @param items 保持しているセキュリティポリシー
	 */
	public void setItems(List<SecurityPolicy> items) {
		this.items = items;
	}
}
