// 商品一覧
var goodsArray = [
    {
        "id": "1", // 商品のID
        "name": "ただうまいだけの塩辛 500g", // 商品名
        "quantity": 0 // 数量
    },
    {
        "id": "2",
        "name": "サーモン塩辛（2瓶セット） 三幸",
        "quantity": 0
    },
    {
        "id": "3",
        "name": "イカの塩辛3種食べ比べセット",
        "quantity": 0
    }
]

// 注文履歴
var orderHistory = [
    {
        "orderId": "1",　// 注文ID(IDが大きいものが新しい)
        "orderData": [
            {
                "id": "1", // 商品のID
                "quantity": 2 // 注文の数量
            }
        ]
    },
    {
        "orderId": "2",
        "orderData": [
            {
                "id": "1",
                "quantity": 1
            },
            {
                "id": "2",
                "quantity": 2
            },
            {
                "id": "3",
                "quantity": 3
            }
        ]
    },
    {
        "orderId": "3",
        "orderData": [
            {
                "id": "2",
                "quantity": 3
            },
            {
                "id": "3",
                "quantity": 2
            }
        ]
    }
]