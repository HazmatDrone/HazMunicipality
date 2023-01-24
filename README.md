# Municipality
Municipality is a mod focused on adding blocks and items allowing players to
better interact with others in a roleplay-focused multiplayer server, such as
mail, post boxes and vending machines for long distance messaging and trade.

## Planned Features

### Envelopes
- Envelopes are crafted with three paper and black dye and are used for sending
mail to other players.
- Eight stamps can be crafted with eight paper and an ender pearl
- Players can address mail to a player directly, or to a specific mailbox, and
write a few paragraphs of text. It costs one stamp to send a letter.
- Envelopes can also hold up to eight stacks of items. Except for the first
item, each stack of items costs one stamp to send.


### Mailbox

- Mailboxes can be crafted with a chest and six iron ingots.
- Players must place a mailbox to be able to receive mail. Upon placing it, they
are prompted to name it and choose its privacy settings (friends/public). Mail
can then be sent to that mailbox.
- The first mailbox placed by a player will be their default mailbox, and
subsequently placed mailboxes will offer the option to set them as default.
	- If a player has no mailbox and receives any sort of mail, it will arrive
	in the very next mailbox they place.
- Players can enable item I/O to automate taking mail from the mailbox. 
- Players can put mail directly into recipients' mailboxes to avoid having to
use stamps entirely (any accidentally included stamps are immediately returned).
- Mailboxes shatter into nothing when destroyed. Their contents will be sent
to the owner's default mailbox if not destroyed by the owner.

### Postbox

- A postbox costs four blocks of iron, four diamonds and an ender pearl to
craft.
- Players can right-click a postbox with a sealed envelope to send it to its
destination.
- Mail takes time to deliver based on the coordinate difference between the
 postbox and the mailbox (default 1 block/tick).
- Postboxes shatter into nothing when destroyed. 

### Trade Mail

- Trade mail is crafted from an envelope with an extra gold nugget, and allows
a player to withhold sending items physically until they reach an agreement with
the recipient.
- When a player receives trade mail, they see the message and a preview of the
items attached that they cannot take. They can use the trade mail to write a
response which can contain a message and items up for exchange.
	- When the first player receives the response, they are then able to accept
	or deny the items, after which the withheld items from both parties will be
	either exchanged or returned through the mail system.
	- Players can set a timeout when sending trade mail to automatically reject
	the trade and return their items if they never receive a response. The other
	party will then also receive a rejection notice.
	- Trade mail can specify a return address for receiving trade items and
	updates	to their preferred mailbox rather than their default.
- Alternatively, players can send mail to a vending machine, which will fulfill
the trade autonomously without requiring a final confirmation from the sender.
	- Players can browse the list of active vending machines in a trade catalog
	and the search bar can lookup player names, vending machine names, and
	trade items.

### Vending Machines

- Vending machines are crafted with an iron block, a diamond and an eye of
ender.
- Vending machines allow players to automate trading of items while busy or
offline.
- Each vending machine is 2 blocks tall and can display up to three trades.
- Each trade can require up to two items/stacks to buy one item/stack
(villager style).
- Players can set limits on the number of trades they want the machine to accept
so that it doesn't eat through all their money inside if buying more than one
type of item. (e.g. only buying a total of 16 eggs for 1 diamond each, but also 
buying limitless raw chicken for 2 diamonds each)
	- Trades with limits will block other trades from using currency if it would
	make the vending machine unable to fulfill all the remaining limited trades.
- Vending machines can be stocked with stamps in order to become listed on the
trading catalog (they re-use the sender's envelope).
- Players can enable item I/O to automate putting stock and stamps in
the vending machine, and taking out currency.
- Vending machines can be configured to cost RF to run.
- If a vending machine is destroyed, it returns everything but the eye of ender/
	- Its contents are mailed to the default mailbox of the owner if not
	destroyed by the owner.

## Design choice notes

- Most of the mail system blocks are reasonably expensive, do not stack and
shatter to discourage players from carrying them on their person while mining or
exploring as a quick way to deposit or receive items. 
- Ender pearls are used in stamps as the mechanism for teleporting mail, and
their colours are used where applicable. They're also accessible immediately
at the start of a new game with a bit of skill or luck, so players can quickly
start setting up mail after settling down.
	- No ender pearls are required by design for players who choose to
	send/receive mail by hand rather than using a postbox, either due to
	being early-game or due to roleplay.
	- Vending machines use eyes of ender as automated trading is a midgame
	feature.
- Vending machines can handle three trades for compactness. A row of 8 machines
can trade up to 24 items, which is reasonable for fitting out a store.
- Items are returned through the mail system to prevent valuables from being
lost in case of griefing.