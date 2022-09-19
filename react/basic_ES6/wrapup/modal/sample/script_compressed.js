const masters = {
    "hopeDate": [{ value: 20221015, id: 20221015, label: "2022/10/15" }, { value: 20221022, id: 20221022, label: "2022/10/22" }, { value: 20221029, id: 20221029, label: "2022/10/29" },], "hopeDestination": [{ value: "", label: "選択してください" }, { value: "1", label: "高尾山" }, { value: "2", label: "奥多摩" }, { value: "3", label: "箱根" }]
}; const setUpModal = function () {
    const { hopeDate, hopeDestination } = masters; const hopeDateList = hopeDate.map(element => {
        return `
<li>
<input
type="checkbox"
name="hope-date"
value="${element.value}"
id="${element.id}"
/>
<label for="${element.id}">${element.label}</label>
</li>
`;
    }); const hopeDestinationList = hopeDestination.map(element => {
        return `
<option value="${element.value}">${element.label}</option>
`;
    }); $("#hope-date-list").append(hopeDateList); $("#hope-destination").append(hopeDestinationList);
}; const submitModal = function () {
    let hopeDate = []; hopeDate = $("input[name='hope-date']:checked").map(function () { return $(this).val(); }).get(); const hopeDestination = $("#hope-destination").val(); const postJson = {
        hopeDate: hopeDate, hopeDestination: hopeDestination
    }; alert(`アンケートを送信しました！ ${JSON.stringify(postJson)}`); $("#modal-background").addClass("display-none");
}; const openModal = function () { $("#modal-background").removeClass("display-none"); }; const closeModal = function () { $("#modal-background").addClass("display-none"); }; const preventCloseModal = function (event) { event.stopPropagation(); }; $(function () { setUpModal(); $("#submit-button").on("click", submitModal); $("#open-button").on("click", openModal); $("#modal-background").on("click", closeModal); $("#modal-content").on("click", event => preventCloseModal(event)); }); 