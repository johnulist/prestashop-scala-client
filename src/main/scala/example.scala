/*
 * Copyright (c) 2011 Orderly Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import co.orderly.prestasac._

import scala.xml._
import scala.xml.parsing._
import scala.io.Source

/**
 * Simple console example of an Amazon Product API call using scalapac
 */
object ExampleOperations {

  def main(args: Array[String]) {

    val client = new PrestaShopClient(
      rootUri = "[YOUR PRESTASHOP API URL HERE]",
      username = "[YOUR PRESTASHOP AUTHENTICATION KEY HERE]")

    PrestaShopApi.attachClient(client)

    // Update this with your Amazon credentials before running
    /*
    // Run some quick checks
    api.get("products", 11)
    api.head("products", 11) // Doesn't seem to work

    api.getURL("http://test.psychicbazaar.com/api/stock_movements?schema=synopsis")

    api.get("stock_movement_reasons/2")
    val newStockMovementReason =
      <prestashop xmlns:xlink="http://www.w3.org/1999/xlink">
        <stock_mvt_reason>
          <name>
            <language id="1">Synchronisation via API</language>
            <language id="2">Synchronisation via API</language>
            <language id="3">Synchronisation via API</language>
            <language id="4">Synchronisation via API</language>
            <language id="5">Synchronisation via API</language>
          </name>
        </stock_mvt_reason>
      </prestashop>

    api.add("stock_movement_reasons", newStockMovementReason) */
  }
}
