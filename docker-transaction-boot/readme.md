<createTransactionRequest>
   <merchantAuthentication>
    <name>5KP3u95bQpv</name>
    <transactionKey>346HZ32z3fP4hTG2</transactionKey>
  </merchantAuthentication>
  <refId>123456</refId>
  <transactionRequest>
    <transactionType>authCaptureTransaction</transactionType>
    <amount>5</amount>
    <payment>
      <bankAccount>
        <accountType>checking</accountType>
        <routingNumber>121042882</routingNumber>
        <accountNumber>123456789</accountNumber>
        <nameOnAccount>John Doe</nameOnAccount>
      </bankAccount>
    </payment>
    <order>
      <invoiceNumber>INV-12345</invoiceNumber>
      <description>Product Description</description>
    </order>
    <lineItems>
      <lineItem>
        <itemId>1</itemId>
        <name>vase</name>
        <description>Cannes logo </description>
        <quantity>18</quantity>
        <unitPrice>45.00</unitPrice>
      </lineItem>
    </lineItems>
    <tax>
      <amount>4.26</amount>
      <name>level2 tax name</name>
      <description>level2 tax</description>
    </tax>
    <duty>
      <amount>8.55</amount>
      <name>duty name</name>
      <description>duty description</description>
    </duty>
    <shipping>
      <amount>4.26</amount>
      <name>level2 tax name</name>
      <description>level2 tax</description>
    </shipping>
    <poNumber>456654</poNumber>
    <billTo>
      <firstName>Ellen</firstName>
      <lastName>Johnson</lastName>
      <company>Souveniropolis</company>
      <address>14 Main Street</address>
      <city>Pecan Springs</city>
      <state>TX</state>
      <zip>44628</zip>
      <country>USA</country>
    </billTo>
    <shipTo>
      <firstName>China</firstName>
      <lastName>Bayles</lastName>
      <company>Thyme for Tea</company>
      <address>12 Main Street</address>
      <city>Pecan Springs</city>
      <state>TX</state>
      <zip>44628</zip>
      <country>USA</country>
    </shipTo>
    <customerIP>192.168.1.1</customerIP>
  </transactionRequest>
</createTransactionRequest>