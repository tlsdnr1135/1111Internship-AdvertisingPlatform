import React from 'react';import SectionHeader from "../../../../../../section/SectionHeader";import ItemLookUpResultBody from "./ItemLookUpResultBody";function ItemLookUpResult() {	return (		<section className="wrap-section wrap-datagrid">			<SectionHeader>				<h2 className="fz-24 fc-gray-700">상품 조회 결과</h2>			</SectionHeader>			<ItemLookUpResultBody/>		</section>	);}export default ItemLookUpResult;