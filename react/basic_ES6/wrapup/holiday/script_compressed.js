const master = {
    "holidayMaster": [{ value: 1, label: "全休" }, { value: 2, label: "半休" }, { value: 3, label: "2時間休" },], "employee": []
}; const CLASS_FOR_STYLE = {
    "DISPLAY_NONE": "display-none", "ONEDAY_HOLIDAY": "oneday-holiday"
}; const makePullDownOptions = () => { const { holidayMaster } = master; return holidayMaster.map(master => `<option value="${master.value}">${master.label}</option>`); }; const output = () => {
    const inputDate = $("#input-date").val(); const inputPeriod = Number($("#input-period").val()); const { holidayMaster } = master; const inputPeriodText = holidayMaster.find(master => { return master.value === inputPeriod; }).label; const onedayHolidayClass = inputPeriod == 1 ? CLASS_FOR_STYLE.ONEDAY_HOLIDAY : ""; const outPutLiElement = `
<li class="${onedayHolidayClass}">
<span>${inputDate}</span>
<span class="icon">${inputPeriodText}</span>
</li>`; $("#output-container ul").append(outPutLiElement);
}; const fliterHistory = () => { const liElementArray = $("#output-container li"); for (const liElement of liElementArray) { $(liElement).addClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`); } const checked = $("#output-only-oneday-holiday").prop("checked"); let displayLiElementArray = checked ? liElementArray.filter(`.${CLASS_FOR_STYLE.ONEDAY_HOLIDAY}`) : liElementArray; for (const liElement of displayLiElementArray) { $(liElement).removeClass(`${CLASS_FOR_STYLE.DISPLAY_NONE}`); } }; $(function () { $("select").append(makePullDownOptions()); $("#register-button").on("click", output); $("#output-only-oneday-holiday").on("change", fliterHistory); }); 