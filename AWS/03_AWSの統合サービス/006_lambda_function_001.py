import json
import boto3

# SNSのクライアント
client = boto3.client('sns')

# 送信情報
request = {
'TopicArn': 'arn:aws:sns:ap-northeast-1:343683174085:*******',
'Message': 'testMessage',
'Subject': 'testSubject'
}

def lambda_handler(event, context):
    # メッセージの発行
    client.publish(**request)