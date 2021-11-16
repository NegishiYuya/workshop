// 商品一覧
var goodsArray = [
    {
        "id": "1", // id
        "name": "商品1", // 商品名
        "price": 6500, // 価格
        "quantity": 0 // 数量
    },
    {
        "id": "2",
        "name": "商品2",
        "price": 3300,
        "quantity": 0 // 数量
    },
    {
        "id": "3",
        "name": "商品3",
        "price": 3000,
        "quantity": 0 // 数量
    }
]

// 購入履歴取得APIのレスポンス
var apiResponse = {
    "userId": 1,　// ユーザID
    "lastOrder": [ // 最終購入データ
        {
            "id": "1", // id
            "quantity": 3 // 数量
        },
        {
            "id": "2",
            "quantity": 2
        },
        {
            "id": "3",
            "quantity": 10
        }
    ]
}
