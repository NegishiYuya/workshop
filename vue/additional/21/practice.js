// 商品一覧
var goodsArray = [
    {
        "id": "1", // ID
        "name": "クリーミーラテ" // 商品名
    },
    {
        "id": "2",
        "name": "エスプレッソ"
    },
    {
        "id": "3",
        "name": "TOKYOキャラメルラブストーリー"
    }
]

// 購入履歴
var orderHistory = [
    {
        "id": 1, // 注文ID(IDが大きいものが最新)
        "order": ["2", "3"] // 注文した商品
    },
    {
        "id": 2,
        "order": ["1", "2"]
    },
    {
        "id": 3,
        "order": ["1", "3"]
    },
]