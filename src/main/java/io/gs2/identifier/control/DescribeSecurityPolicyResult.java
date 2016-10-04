package io.gs2.identifier.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.SecurityPolicy;

/**
 * セキュリティポリシー一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeSecurityPolicyResult {

	/** セキュリティポリシー一覧 */
	List<SecurityPolicy> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したセキュリティポリシー数を取得。
	 * 
	 * @return 取得したセキュリティポリシー数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したセキュリティポリシー一覧を取得。
	 * 
	 * @return セキュリティポリシー一覧
	 */
	public List<SecurityPolicy> getItems() {
		return items;
	}
	
	/**
	 * セキュリティポリシー一覧を設定。
	 * 
	 * @param items セキュリティポリシー一覧
	 */
	public void setItems(List<SecurityPolicy> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeSecurityPolicyRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
