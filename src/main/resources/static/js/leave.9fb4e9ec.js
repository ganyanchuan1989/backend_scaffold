"use strict";(self["webpackChunkhrms_frontend"]=self["webpackChunkhrms_frontend"]||[]).push([[547],{5593:function(e,a,l){var t=l(9200);class u{add(e){return(0,t.W)("/api/employee/add",{method:"POST",data:e})}update(e){return(0,t.W)("/api/employee/update",{method:"POST",data:e})}delete(e){return(0,t.W)("/api/employee/delete",{method:"POST",data:e})}list(){return(0,t.W)("/api/employee/list",{method:"POST"})}listAll(){return(0,t.W)("/api/employee/listAll",{method:"POST"})}queryByCode(e){return(0,t.W)("/api/employee/queryByCode",{method:"POST",data:e})}likeByCode(e){return(0,t.W)("/api/employee/likeByCode",{method:"POST",data:e})}login(e){return(0,t.W)("/api/employee/login",{method:"POST",data:e})}modifyPwd(e){return(0,t.W)("/api/employee/modifyPwd",{method:"POST",data:e})}}a["Z"]=new u},9394:function(e,a,l){l.d(a,{u:function(){return t}});const t=(e,a)=>{for(let l in e)e[l]=a[l];return e}},4055:function(e,a,l){l.r(a),l.d(a,{default:function(){return f}});var t=l(3396),u=l(4870),d=l(7139),o=l(5593),n=l(7571),r=l(2074),v=l(2483),i=l(8439),p=l(9394),m=l(5508),s={__name:"LeaveAdd",setup(e){const a=(0,v.yj)(),l=(0,v.tv)();let s=i.zw.ADD,y=null,f=(0,u.qj)({empCode:void 0,leaveType:void 0,leaveStartDate:void 0,leaveEndDate:void 0,leaveDay:1,leaveDesc:void 0});const c=(0,u.qj)({value:[]}),w=(0,u.iH)(),D=async e=>{if(s===i.zw.UPDATE){e={...y,...e};const a=await n.Z.update(e);r.ZP.info("修改成功："+a.leaveCode),l.back()}else{const a=await n.Z.add(e);r.ZP.info("新增成功："+a.leaveCode),w.value.resetFields()}};(0,t.bv)((async()=>{S(),a.params.code&&(s=i.zw.UPDATE,y=await n.Z.queryByCode({leaveCode:a.params.code}),(0,p.u)(f,{...y}))}));const S=async()=>{c.value=await o.Z.list()};return(e,a)=>{const l=(0,t.up)("a-select-option"),o=(0,t.up)("a-select"),n=(0,t.up)("a-form-item"),r=(0,t.up)("a-date-picker"),v=(0,t.up)("a-input"),p=(0,t.up)("a-textarea"),s=(0,t.up)("a-button"),y=(0,t.up)("a-form");return(0,t.wg)(),(0,t.iD)("div",null,[(0,t.Wm)(y,(0,t.dG)({model:(0,u.SU)(f),ref_key:"formRef",ref:w,autocomplete:"off",onFinish:D},(0,u.SU)(i.Ju)),{default:(0,t.w5)((()=>[(0,t.Wm)(n,{label:"员工姓名",name:"empCode",rules:[{required:!0,message:"合同签订时间!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(o,{value:(0,u.SU)(f).empCode,"onUpdate:value":a[0]||(a[0]=e=>(0,u.SU)(f).empCode=e)},{default:(0,t.w5)((()=>[((0,t.wg)(!0),(0,t.iD)(t.HY,null,(0,t.Ko)(c.value,((e,a)=>((0,t.wg)(),(0,t.j4)(l,{key:a,value:e.empCode},{default:(0,t.w5)((()=>[(0,t.Uk)((0,d.zw)(e.empName),1)])),_:2},1032,["value"])))),128))])),_:1},8,["value"])])),_:1}),(0,t.Wm)(n,{label:"请假类型",name:"leaveType",rules:[{required:!0,message:"请选择请假开始时间!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(o,{value:(0,u.SU)(f).leaveType,"onUpdate:value":a[1]||(a[1]=e=>(0,u.SU)(f).leaveType=e)},{default:(0,t.w5)((()=>[((0,t.wg)(!0),(0,t.iD)(t.HY,null,(0,t.Ko)((0,u.SU)(m.hi)("hrms_leave_type"),((e,a)=>((0,t.wg)(),(0,t.j4)(l,{key:a,value:e.dataDictValue},{default:(0,t.w5)((()=>[(0,t.Uk)((0,d.zw)(e.dataDictLabel),1)])),_:2},1032,["value"])))),128))])),_:1},8,["value"])])),_:1}),(0,t.Wm)(n,{label:"请假开始时间",name:"leaveStartDate",rules:[{required:!0,message:"请选择请假开始时间!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(r,{value:(0,u.SU)(f).leaveStartDate,"onUpdate:value":a[2]||(a[2]=e=>(0,u.SU)(f).leaveStartDate=e),"value-format":"YYYY-MM-DD"},null,8,["value"])])),_:1}),(0,t.Wm)(n,{label:"请假结束时间",name:"leaveEndDate",rules:[{required:!0,message:"请选择请假开始时间!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(r,{value:(0,u.SU)(f).leaveEndDate,"onUpdate:value":a[3]||(a[3]=e=>(0,u.SU)(f).leaveEndDate=e),"value-format":"YYYY-MM-DD"},null,8,["value"])])),_:1}),(0,t.Wm)(n,{label:"请假天数",name:"leaveDay",rules:[{required:!0,message:"请选择请假开始时间!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(v,{value:(0,u.SU)(f).leaveDay,"onUpdate:value":a[4]||(a[4]=e=>(0,u.SU)(f).leaveDay=e)},null,8,["value"])])),_:1}),(0,t.Wm)(n,{label:"请假事由",name:"leaveDesc",rules:[{required:!0,message:"请输入请假简介!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(p,{value:(0,u.SU)(f).leaveDesc,"onUpdate:value":a[5]||(a[5]=e=>(0,u.SU)(f).leaveDesc=e)},null,8,["value"])])),_:1}),(0,t.Wm)(n,{"wrapper-col":{offset:8,span:16}},{default:(0,t.w5)((()=>[(0,t.Wm)(s,{type:"primary","html-type":"submit"},{default:(0,t.w5)((()=>[(0,t.Uk)("保存")])),_:1})])),_:1})])),_:1},16,["model"])])}}};const y=s;var f=y},5016:function(e,a,l){l.r(a),l.d(a,{default:function(){return D}});l(7658);var t=l(3396),u=l(4870),d=l(7139),o=l(7571),n=l(2483),r=l(2074),v=l(8439),i=l(8549),p=l(5508);const m=["onClick"],s=(0,t._)("a",null,"删除",-1),y=["onClick"],f=["onClick"];var c={__name:"LeaveList",setup(e){const a=(0,n.tv)(),l=(0,n.yj)(),c=[{title:"请假ID",dataIndex:"leaveId",key:"leaveId"},{title:"请假类型",dataIndex:"leaveType",key:"leaveType"},{title:"开始时间",dataIndex:"leaveStartDate",key:"leaveStartDate"},{title:"结束时间",dataIndex:"leaveEndDate",key:"leaveEndDate"},{title:"请假事由",dataIndex:"leaveDesc",key:"leaveDesc"},{title:"审批状态",dataIndex:"approvalStatus",key:"approvalStatus"},{title:"操作",dataIndex:"operation"}],w=(0,u.iH)([]),D=(0,u.iH)();let S=(0,u.qj)({leaveId:""});const k=(0,u.iH)(!1),U=(0,u.iH)(!1),_=async e=>{"/leave/my"===l.fullPath?(k.value=!0,w.value=await o.Z.listByEmpCode({...e,empCode:(0,i.bG)().empCode})):w.value=await o.Z.likeByCode(e)},C=async()=>{D.value.resetFields(),h()};(0,t.bv)((async()=>{h()}));const W=e=>{a.push({path:`/leave/update/${e.leaveId}`})},h=async()=>{"/leave/my"===l.fullPath?(k.value=!0,w.value=await o.Z.listByEmpCode({empCode:(0,i.bG)().empCode})):"/leave/approve"===l.fullPath?(U.value=!0,w.value=await o.Z.queryDeptUnapprovalLeave({deptCode:(0,i.bG)().deptCode})):w.value=await o.Z.list()},b=async e=>{await o.Z["delete"]({...e,dataStatus:v.s_.DELETE}),r.ZP.info("删除成功："+e.leaveId),h()},g=async(e,a)=>{await o.Z.update({...e,approvalStatus:a}),r.ZP.info("处理成功："+e.leaveId),h()};return(e,a)=>{const l=(0,t.up)("a-input"),o=(0,t.up)("a-form-item"),n=(0,t.up)("a-button"),r=(0,t.up)("a-form"),i=(0,t.up)("a-popconfirm"),h=(0,t.up)("a-table");return(0,t.wg)(),(0,t.iD)("div",null,[(0,t.Wm)(r,(0,t.dG)({model:(0,u.SU)(S),name:"basic",autocomplete:"off",onFinish:_},(0,u.SU)(v.Ju),{ref_key:"formRef",ref:D}),{default:(0,t.w5)((()=>[(0,t.Wm)(o,{label:"请假ID",name:"leaveId",rules:[{required:!0,message:"请输入请假ID!"}]},{default:(0,t.w5)((()=>[(0,t.Wm)(l,{value:(0,u.SU)(S).leaveId,"onUpdate:value":a[0]||(a[0]=e=>(0,u.SU)(S).leaveId=e)},null,8,["value"])])),_:1}),(0,t.Wm)(o,{"wrapper-col":{offset:8,span:16}},{default:(0,t.w5)((()=>[(0,t.Wm)(n,{type:"primary","html-type":"submit"},{default:(0,t.w5)((()=>[(0,t.Uk)("查询")])),_:1}),(0,t.Wm)(n,{onClick:C,style:{"margin-left":"10px"}},{default:(0,t.w5)((()=>[(0,t.Uk)("重置")])),_:1})])),_:1})])),_:1},16,["model"]),(0,t.Wm)(h,{dataSource:w.value,columns:c},{bodyCell:(0,t.w5)((({column:e,record:a})=>["operation"!==e.dataIndex||k.value?(0,t.kq)("",!0):((0,t.wg)(),(0,t.iD)(t.HY,{key:0},[U.value?((0,t.wg)(),(0,t.iD)(t.HY,{key:1},[(0,t._)("a",{onClick:e=>g(a,(0,u.SU)(v.Oq).AGREE)},"同意",8,y),(0,t.Uk)(" | "),(0,t._)("a",{onClick:e=>g(a,(0,u.SU)(v.Oq).REJECT)},"拒绝",8,f)],64)):((0,t.wg)(),(0,t.iD)(t.HY,{key:0},[(0,t._)("a",{onClick:e=>W(a)},"修改",8,m),(0,t.Uk)(" | "),w.value.length?((0,t.wg)(),(0,t.j4)(i,{key:0,title:"确定要删除吗?",onConfirm:e=>b(a)},{default:(0,t.w5)((()=>[s])),_:2},1032,["onConfirm"])):(0,t.kq)("",!0)],64))],64)),"leaveType"===e.dataIndex?((0,t.wg)(),(0,t.iD)(t.HY,{key:1},[(0,t.Uk)((0,d.zw)((0,u.SU)(p.RZ)("hrms_leave_type",a.leaveType)),1)],64)):(0,t.kq)("",!0),"approvalStatus"===e.dataIndex?((0,t.wg)(),(0,t.iD)(t.HY,{key:2},[(0,t.Uk)((0,d.zw)((0,u.SU)(p.RZ)("approval_status",a.approvalStatus)),1)],64)):(0,t.kq)("",!0)])),_:1},8,["dataSource"])])}}};const w=c;var D=w}}]);
//# sourceMappingURL=leave.9fb4e9ec.js.map