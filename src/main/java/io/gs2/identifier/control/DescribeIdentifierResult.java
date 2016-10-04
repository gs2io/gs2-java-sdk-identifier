package io.gs2.identifier.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.Identifier;

/**
 * GSI一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeIdentifierResult {

	/** GSI一覧 */
	List<Identifier> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したGSI数を取得。
	 * 
	 * @return 取得したGSI数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したGSI一覧を取得。
	 * 
	 * @return GSI一覧
	 */
	public List<Identifier> getItems() {
		return items;
	}
	
	/**
	 * GSI一覧を設定。
	 * 
	 * @param items GSI一覧
	 */
	public void setItems(List<Identifier> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeIdentifierRequest} に指定することで、次のページを取得できます。
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
