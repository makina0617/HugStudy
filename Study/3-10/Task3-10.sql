/* ■ [回答]と記載のある箇所へ、1〜8の各課題内容に沿ったSQL文を記述しなさい。 */

-- 1. Staffテーブルから「経理部」に所属する社員の情報をすべて抽出してください。
SELECT * FROM staff WHERE section = '経理部';

-- 2. 在庫(Stocksテーブル)の在庫数(Quantity)が10以上25未満のものを抽出して下さい。
SELECT * FROM Stocks
WHERE quantity >= 10 AND quantity <= 25;

-- 3. INTERSECT演算子を使用して、Order_Headerテーブルで合計値(Total)が5000以上10000未満のものを抽出して下さい。
SELECT A.* FROM Order_Header A WHERE A. Total > 5000
INTERSECT
SELECT B.* FROM Order_Header B WHERE B. Total < 10000;

-- 4. 「関東」エリアの全店舗情報を抽出して下さい。
SELECT * FROM area JOIN shop ON area.areacode = shop.areacode
WHERE area.areaname = '関東';
-- 5. 在庫(Stocksテーブル)内の各商品の合計数量を抽出して下さい。
SELECT goodscode, SUM(quantity) FROM Stocks GROUP BY goodscode;

-- 6. 商品（Gods）テーブルから単価（UnitPrice)が5000円より高い商品の情報を全て抽出して下さい。
SELECT * FROM goods WHERE unitprice>=5000;

-- 7. Shopテーブルの全ての店舗コード（Shopcode）、店舗名（Shopname）を、所在地（areaname）とあわせて抽出してください。
SELECT shop. shopcode, shop. shopname, area. areaname
FROM area JOIN shop ON area.areacode = shop.areacode;

-- 8. 「新宿」店の在庫数が10以上の商品の商品コード（GoodsCode）、商品名（GoodsName）、在庫数（quantity）を抽出して下さい。
SELECT stocks.goodscode,stocks.quantity,goods.goodsname
FROM stocks JOIN shop ON stocks.shopcode = shop.shopcode 
JOIN goods ON goods.goodscode = stocks.goodscode 
WHERE shop.shopname = '新宿'AND quantity >= 10;
