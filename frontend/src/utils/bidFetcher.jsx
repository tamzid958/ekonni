

import {getServerApi} from "@/utils/axios.settings";

let req = {
    'content-type': 'application/json'
}
export const bidFetcher = async url => await getServerApi({req,url}).then((res) => res.data)