import {Button, message, Table} from "antd";import Column from 'antd/es/table/Column';import React, {useContext} from 'react';import {INACTIVE_ITEM} from "../../../../../../utils/Const";import {AdRegisterContext} from "../../AdRegContent";import {Item, ItemContext, ItemDefaultValue} from "./ItemLookUp";function ItemLookUpResult() {	const itemContext = useContext(ItemContext);	const adRegisterContext = useContext(AdRegisterContext);	const actN = INACTIVE_ITEM;	const [messageApi, contextHolder] = message.useMessage();	function handleItemSelect(record: Item) {		if (record.itemActYn === actN) {			itemContext.setSelectedItem(ItemDefaultValue);			adRegisterContext.setIsSelectedItem(false);			return messageApi.error("비활성화된 상품은 광고 등록을 진행 X");		}		itemContext.setSelectedItem(record);		adRegisterContext.setItemId(record.key);		adRegisterContext.setIsSelectedItem(true);	}	return (		<section className="wrap-section wrap-datagrid">			{contextHolder}			<div className="box-header">				<div className="box-left">					<h2 className="fz-24 fc-gray-700">상품 조회 결과</h2>				</div>			</div>			<div className="box-body">				<Table dataSource={itemContext.items} bordered pagination={{showSizeChanger: true, showTotal: ((total) => <p>Total {total} items</p>)}}>					<Column title="상품번호" dataIndex="itemNo" align="center"/>					<Column title="상품명" dataIndex="itemName" align="center"/>					<Column title="성인 상품 여부" dataIndex="adultYn" align="center"/>					<Column title="상품 가격" dataIndex="itemOrgCost" align="center"/>					<Column title="상품 활성화 여부" dataIndex="itemActYn" align="center"/>					<Column title="상품 선택" dataIndex="itemSelect" align="center"					        render={(_, record: Item) => (<Button type="default" size="small" className="pink" onClick={() => handleItemSelect(record)}>선택</Button>)}					/>				</Table>			</div>		</section>	);}export default ItemLookUpResult;