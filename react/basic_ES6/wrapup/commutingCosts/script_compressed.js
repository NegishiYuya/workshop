const masters = {
    "facilities": [{ value: 0, label: "選択してください" }, { value: 1, label: "IC利用" }, { value: 2, label: "回数券利用" }, { value: 3, label: "その他" },], "payment": [{ value: 1, label: "現金" }, { value: 2, label: "振込" }, { value: 3, label: "その他" },]
}; const CLASS_FOR_STYLE = {
    "DISPLAY_NONE": "display-none", "USE_COUPON": "use-coupun"
}; const makePullDowns = () => { const { facilities, payment } = masters; makePullDown("input-facilities", facilities); makePullDown("input-payments", payment); }; const makePullDown = (id, masterArray) => { const options = masterArray.map(master => `<option value="${master.value}">${master.label}</option>`); $(`#${id}`).append(options); }; const output = () => {
    const inputDate = $("#input-date").val(); const inputFrom = $("#input-from").val(); const inputTo = $("#input-to").val(); const inputCosts = Number($("#input-costs").val()); const inputFacilities = Number($("#input-facilities").val()); const { facilities } = masters; const inputFacilitiesText = facilities.find(master => { return master.value === inputFacilities; }).label; const outputFacilitiesClass = inputFacilities === 2 ? CLASS_FOR_STYLE.USE_COUPON : ""; const outPutLiElement = `
<li class="${outputFacilitiesClass}">
<span>${inputDate}</span>
<span>${inputFrom}～${inputTo}</span>
<span>${inputCosts}円</span>
<span>備考：${inputFacilitiesText}</span>
</li>`; $("#output-container ul").append(outPutLiElement);
}; const fliter = () => { const liElementArray = $("#output-container li"); liElementArray.addClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`); const checked = $("#use-coupon-only").prop("checked"); const displayLiElementArray = checked ? liElementArray.filter(`.${CLASS_FOR_STYLE.USE_COUPON}`) : liElementArray; displayLiElementArray.removeClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`); }; $(function () { makePullDowns(); $("#register-button").on("click", output); $("#use-coupon-only").on("click", fliter); }); 