package io.gs2.identifier.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.identifier.model.Identifier;

/**
 * GSIの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateIdentifierResult {
	
	Identifier item;
	
	/**
	 * GSIを取得。
	 * 
	 * @return GSI
	 */
	public Identifier getItem() {
		return item;
	}
	
	/**
	 * GSIを設定。
	 * 
	 * @param item GSI
	 */
	public void setItem(Identifier item) {
		this.item = item;
	}
	
	/**
	 * GSIを設定。
	 * 
	 * @param item GSI
	 * @return this
	 */
	public CreateIdentifierResult withItem(Identifier item) {
		setItem(item);
		return this;
	}
}
