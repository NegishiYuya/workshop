import boto3

# s3操作のための変数
s3 = boto3.client('s3')

def read_file(bucket_name, file_key):
    response = s3.get_object(Bucket=bucket_name, Key=file_key)
    return response[u'Body'].read().decode('utf-8')

def upload_file(bucket_name, file_key, bytes):
    out_s3 = boto3.resource('s3')
    s3Obj = out_s3.Object(bucket_name, file_key)
    res = s3Obj.put(Body = bytes)
    return res

def lambda_handler(event, context):
    print('ファイルがアップロードされました')

    # トリガーで発生するイベントからバケット名とオブジェクトのキーを取得する
    input_bucket = event['Records'][0]['s3']['bucket']['name']
    input_key = event['Records'][0]['s3']['object']['key']
    
    # S3からファイルを読み込み
    text = read_file(input_bucket, input_key)
    # outputのキーを設定
    input_filename = input_key.split('/')[1]
    output_key = "outputs/" + input_filename
    # ファイルをS3に出力
    upload_file(input_bucket, output_key, bytes(text, 'UTF-8'))