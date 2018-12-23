/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import groovy.json.JsonBuilder
import groovy.util.logging.Slf4j
import groovyx.net.http.RESTClient
import spock.lang.Specification

@Slf4j
class ProductApiSpec extends Specification {


    RESTClient restClient = new RESTClient(Constant.payworkTestURL)

    def 'User should be able to get products in sorted order'() {


        setup:
        def addressLine1 = "506 4TH AVE APT 1"
        def addressLine2 = "ASBURY PARK, NJ 07712-6086"

        //limit.times { testProducIdList << createTestProduct().responseData.id }

        when:
        def response = restClient.get(
                query: [
                        'AddressLine1': addressLine1,
                        'AddressLine2': addressLine2
                ]
        )

        //def priceList = []
        //response.responseData.data.each { it -> priceList << it.price }

        println "response: " + new JsonBuilder(response.responseData).toPrettyString()

        then:
        response.status == 200

//        and:
//        response.responseData.data
//        response.responseData.limit == limit
//        response.responseData.data.size == limit
//        priceList.size == limit
//        priceList == priceList.sort(true)
//
//        cleanup:
//        testProducIdList.each {
//            deleteTestProduct(it)
//        }
    }
}